import Foundation

func solution(_ n:Int, _ m:Int, _ section:[Int]) -> Int {
    var answer = 0
    var start = section[0]
    answer += 1
    for i in section {
        if start + m > i {
            continue
        }
        start = i
        answer += 1
    }
    
    return answer
}