import Foundation

func solution(_ food:[Int]) -> String {
    var result = ""
    var arr = food
    for (index, cnt) in arr.enumerated() {
        var cnt = cnt
        if cnt != 0 {
            if cnt % 2 != 0 {
                cnt = (cnt - 1) / 2
                arr[index] = cnt
            } else {
                cnt = cnt / 2
                arr[index] = cnt
            }
        }
        for j in 0..<cnt {
            result.append(String(index))
        }
    }
    var reverceStr = result.reversed()
    result += "0"
    result += reverceStr
    return result
}