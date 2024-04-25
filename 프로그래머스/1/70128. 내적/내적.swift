import Foundation

func solution(_ a:[Int], _ b:[Int]) -> Int {
    var result:Int = 0
    
    for (i, j) in zip(a, b) {
        result += i * j
    }
    
    return result
}