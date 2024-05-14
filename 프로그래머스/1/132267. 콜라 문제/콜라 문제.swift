import Foundation

func solution(_ a:Int, _ b:Int, _ n:Int) -> Int {
    var result = 0
    var empty = a
    var full = b
    var num = n
    while num >= empty {
        var cnt = 0
        cnt += num / empty
        result += cnt * full
        num = (cnt * full) + (num % empty)
    }
    return result
}