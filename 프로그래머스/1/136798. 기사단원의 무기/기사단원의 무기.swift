import Foundation

func solution(_ number:Int, _ limit:Int, _ power:Int) -> Int {
    var result = 0
    for i in 1...number {
        var j = 1
        var count = 0
        while(j * j <= i) {
            if (j * j == i) {
                count += 1
            } else if(i % j == 0) {
                count += 2
            }
            j += 1
        }
        if count > limit {
            result += power
        } else {
            result += count
        }
    }
    return result
}