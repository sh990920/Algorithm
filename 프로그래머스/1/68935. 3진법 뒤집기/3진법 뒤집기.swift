import Foundation

func solution(_ n:Int) -> Int {
    var result = 0
    var three: String = ""
    var num = 3
    var numCount = 1
    var N = n
    
    while (N > 0) {
        if (N >= num) {
            num *= 3
            numCount += 1
            continue
        } else {
            num /= 3
            var cnt = N / num
            three += String(cnt)
            N = N % num
        }
    }
    if three.count < numCount {
        for i in 0 ..< numCount - three.count {
            three += "0"
        }
    }
    var cnt = 0
    for i in three {
        if let res = Int(String(i)) {
            if cnt == 0 {
                result += res
            } else {
                result += Int(Double(res) * pow(Double(3), Double(cnt)))
            }
        }
        cnt += 1
    }
    return result
}