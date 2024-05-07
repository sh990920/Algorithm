import Foundation

func solution(_ s:String) -> String {
    var result = ""
    var idx = 0

    for char in s {
        if char == " " {
            result.append(" ")
            idx = 0
        } else {
            if idx % 2 == 0 {
                result.append(char.uppercased())
            } else {
                result.append(char.lowercased())
            }
            idx += 1
        }
    }
    return result
}