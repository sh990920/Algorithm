import Foundation

func combination(_ n: Int, _ k: Int) -> Int {
    if k > n {
        return 0
    }
    if k == 0 || k == n {
        return 1
    }
    let k = min(k, n - k)
    var result = 1
    for i in 0..<k {
        result = result * (n - i) / (i + 1)
    }
    
    return result
}

let T = Int(readLine()!)!

for _ in 0..<T {
    let input = readLine()!.split(separator: " ").map { Int($0)! }
    let N = input[0]
    let M = input[1]
    
    let result = combination(M, N)
    print(result)
}