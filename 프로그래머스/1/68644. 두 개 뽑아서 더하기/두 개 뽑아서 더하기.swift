import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    var result: Set<Int> = []

    let len = numbers.count

    for i in 0..<len {
        for j in i+1..<len {
            let num1 = numbers[i]
            let num2 = numbers[j]
            result.insert(num1 + num2)
        }
    }
    let res = Array(result).sorted()
    return res
}