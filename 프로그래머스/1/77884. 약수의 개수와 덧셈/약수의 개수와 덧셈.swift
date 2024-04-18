import Foundation

func solution(_ left:Int, _ right:Int) -> Int {
    var result = 0
    var arr = Array<Int>()
    for i in left ... right {
        let count = divisor(i)
        arr.append(count)
    }
    
    for i in 0 ..< arr.count {
        if arr[i] % 2 == 0 {
            result += i + left
        }else {
            result -= i + left
        }
    }
    
    
    return result
}

func divisor(_ num: Int) -> Int {
    var count: Int = 0
    for i in 1 ... num {
        if num % i == 0 {
            count += 1
        }
    }
    return count
}