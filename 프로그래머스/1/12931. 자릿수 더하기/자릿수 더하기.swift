import Foundation

func solution(_ n:Int) -> Int
{
    var answer:Int = 0
    var str_n = String(n)
    for i in str_n{
        answer += Int(String(i))!
    }
    
    return answer
}