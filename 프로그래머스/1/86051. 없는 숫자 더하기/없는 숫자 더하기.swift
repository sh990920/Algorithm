import Foundation

func solution(_ numbers:[Int]) -> Int {
    var result:Int = 0
    for i in 0...9 {
        if !numbers.contains(i) {
            result += i
        }
    }
    return result
}