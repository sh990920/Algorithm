import Foundation

func solution(_ price:Int, _ money:Int, _ count:Int) -> Int64{
    var answer:Int64 = 0
    var pay:Int64 = 0
    for i in 1...count {
        pay += Int64(price * i)
    }
    if pay > money {
        answer = pay - Int64(money)
    }
    return answer
}