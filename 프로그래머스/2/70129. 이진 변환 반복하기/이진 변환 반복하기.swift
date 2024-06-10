import Foundation

func solution(_ s:String) -> [Int] {
    var s = s
    var binaryCnt = 0 // 이진변환 횟수
    var zeroCnt = 0 // 지워진 0의 갯수
    
    while s != "1" {
        let xLength = s.filter{$0 != "0"}.count // 1의 갯수
        let zero = s.count - xLength // 0의 갯수

        s = String(xLength, radix: 2) // 이진변환
        
        binaryCnt += 1
        zeroCnt += zero
    }
    
    return [binaryCnt, zeroCnt]
}