import Foundation

func solution(_ num1:Int, _ num2:Int) -> Int {
    var res: Double = Double(num1) / Double(num2)
    res *= 1000
    return Int(res)
}