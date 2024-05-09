import Foundation

func solution(_ array:[Int]) -> Int {
    var arr = array
    arr.sort()
    var result = 0
    var arrLength = arr.count
    result = arr[(arrLength - 1) / 2]
    return result
}