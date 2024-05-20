import Foundation

func solution(_ k:Int, _ m:Int, _ score:[Int]) -> Int {
    var result = 0
    var count = 0
    var scoreLen = score.count
    var sortArr = score
    sortArr.sort(by: >)
    while(count < scoreLen) {
        if count + m - 1 >= scoreLen {
            break
        } else {
            var num = sortArr[count + m - 1]
            result += num * m
        }
        count += m
    }
    return result
}