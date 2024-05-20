import Foundation

func isTrue(_ cards:[String], _ goal:[String]) -> Bool {
    var result = true
    var idxArr = Array<Int>()
    outer : for i in 0..<cards.count {
        if let idx = goal.firstIndex(of: cards[i]) {
            idxArr.append(idx)
        } else {
            idxArr.append(-1)
        }
        if idxArr[i] != -1 {
            for j in 0..<i {
                if idxArr[j] == -1 {
                    result = false
                    break outer
                }
                if idxArr[i] < idxArr[j] {
                    result = false
                    break outer
                }
            }
        }
    }
    return result
}

func solution(_ cards1:[String], _ cards2:[String], _ goal:[String]) -> String {
    var result = "Yes"
    var result1 = isTrue(cards1, goal)
    var result2 = isTrue(cards2, goal)
    if result1 == false || result2 == false {
        result = "No"
    }
    return result
}