import Foundation

func solution(_ numbers:[Int]) -> Double {
    var sum:Double = 0
    for i in numbers{
        sum += Double(i)
    }
    sum /= Double(numbers.count)
    return sum
}