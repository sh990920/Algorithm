import Foundation

func solution(_ n:Int64) -> Int64 {
    var result:Int64 = 0
    var a:Double = sqrt(Double(n))
    if a.truncatingRemainder(dividingBy: 1.0) != 0.0{
        result = -1
    }else {
        let num = Int(a) + 1
        result = Int64(num * num)
    }
    return result
}