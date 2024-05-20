import Foundation

func solution(_ answers:[Int]) -> [Int] {
    var result = Array<Int>()
    
    let aList = [1, 2, 3, 4, 5]
    let aLen = aList.count
    let bList = [2, 1, 2, 3, 2, 4, 2, 5]
    let bLen = bList.count
    let cList = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    let cLen = cList.count
    var dict = [1: 0, 2: 0, 3: 0]
    
    let len = answers.count
    
    for i in 0 ..< len {
        if answers[i] == aList[i % aLen] {
            dict[1]! += 1
        }
        if answers[i] == bList[i % bLen] {
            dict[2]! += 1
        }
        if answers[i] == cList[i % cLen] {
            dict[3]! += 1
        }
    }
    
    let maxNum = max(dict[1]! ,dict[2]!, dict[3]!)
    
    for key in dict.keys {
        if dict[key]! == maxNum{
            result.append(key)
        }
    }
    
    result.sort()
    
    return result
}