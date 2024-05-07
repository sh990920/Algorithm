import Foundation

func isTrue(_ n1:Int, _ n2:Int, _ n3:Int) -> Bool {
    return n1 + n2 + n3 == 0
}

func solution(_ number:[Int]) -> Int {
    var res = 0
    var size = number.count
    for i in 0..<(size - 2) {
        for j in (i + 1)..<(size - 1) {
            for k in (j + 1)..<size {
                if isTrue(number[i], number[j], number[k]) {
                    res += 1
                }
            }
        }
    }
    return res
}