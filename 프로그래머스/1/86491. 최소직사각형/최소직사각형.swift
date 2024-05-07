import Foundation

func solution(_ sizes:[[Int]]) -> Int {
    var sizeArr = sizes
    var sizeArrLength = sizeArr.count
    for i in 0..<sizeArrLength {
        var size = sizeArr[i]
        let a = size[0]
        let b = size[1]
        if b > a {
            size[0] = b
            size[1] = a
        }
        sizeArr[i] = size
    }
    var width = 0
    var height = 0
    for size in sizeArr {
        if size[0] > width {
            width = size[0]
        }
        if size[1] > height {
            height = size[1]
        }
    }
    return width * height
}