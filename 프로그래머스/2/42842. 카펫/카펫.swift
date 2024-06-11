import Foundation

func solution(_ brown:Int, _ yellow:Int) -> [Int] {
    var result = Array<Int>()
    var arr = Array<Int>()
    for i in 1...yellow {
        if yellow % i == 0 {
            arr.append(i)
        }
    }
    var arrCount = arr.count
    if arrCount % 2 != 0 {
        arrCount += 1
    }
    arrCount /= 2
    for i in 0..<arrCount {
        var row = arr[i]
        var column = arr[(arr.count - 1) - i]
        var brownArea = ((row + 2) * 2) + (column * 2)
        if brown == brownArea {
            result.append(column + 2)
            result.append(row + 2)
        }
    }
    return result
}