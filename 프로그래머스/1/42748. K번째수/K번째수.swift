import Foundation

func solution(_ array:[Int], _ commands:[[Int]]) -> [Int] {
    var result = Array<Int>()
    for i in commands {
        var start = i[0] - 1
        var end = i[1] - 1
        var index = i[2] - 1
        var arr = Array(array[start...end])
        arr.sort()
        var num = arr[index]
        result.append(num)
    }
    return result
}