import Foundation

func solution(_ n:Int) -> Int {
    var res : Int = 0
    for i in 2 ..< n {
        if(n % i == 1){
            res = i
            break
        }
    }
    return res
}