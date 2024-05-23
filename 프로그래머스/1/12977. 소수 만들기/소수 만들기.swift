import Foundation

func isPrime(_ n: Int) -> Bool {
    if n % 2 == 0 {
        return false
    }
    let limit = Int(sqrt(Double(n)))
    for i in stride(from: 3, through: limit, by: 2) {
        if n % i == 0 {
            return false
        }
    }
    return true
}

func solution(_ nums:[Int]) -> Int {
    var answer = 0
    let len = nums.count
    for i in 0..<len {
        for j in i+1..<len {
            for k in j+1..<len {
                if isPrime(nums[i] + nums[j] + nums[k]) {
                    answer += 1
                }
            }
        }
    }
    
    return answer
}