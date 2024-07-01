import Foundation

func solution(_ topping:[Int]) -> Int {
    var answer = 0
    var first = Dictionary<Int, Int>()
    var second = Set<Int>()
    
    for i in topping {
        if let count = first[i] {
            first[i] = count + 1
        } else {
            first[i] = 1
        }
    }
    
    for i in topping {
        second.insert(i)
        if let count = first[i] {
            first[i] = count - 1
        }
        if let count = first[i], count == 0 {
            first[i] = nil
        }
        if first.count == second.count {
            answer += 1
        }
    }
    
    
    return answer
}