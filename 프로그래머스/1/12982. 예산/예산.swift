import Foundation

func solution(_ d:[Int], _ budget:Int) -> Int {
    var result: Int = 0
    var dList = d
    var money = budget
    dList.sort()
    
    for i in dList {
        if(money < i) {
            break
        }
        money -= i
        result += 1
    }
    
    return result
}