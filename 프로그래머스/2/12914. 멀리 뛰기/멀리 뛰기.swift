func solution(_ n:Int) -> Int {
    var result = [1, 2]
    var count = 0
    while result.count < n {
        result.append((result[count] + result[count + 1]) % 1234567)
        count += 1
    }
    
    
    return result[n - 1]
}