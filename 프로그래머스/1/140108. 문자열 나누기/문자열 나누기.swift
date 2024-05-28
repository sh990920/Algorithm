import Foundation

func solution(_ s:String) -> Int {
    var result = 0
    var str = s
    var a = 0
    var b = 0
    var isEquals = false
    var x = str[str.startIndex]
    while !str.isEmpty {
        let delete = str.removeFirst()

        if isEquals {
            x = delete
            isEquals = false
        }

        if x == delete {
            a += 1
        } else {
            b += 1
        }

        if a == b || str.isEmpty {
            result += 1
            isEquals = true
            a = 0
            b = 0
        }
    }
    return result
}