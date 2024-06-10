func solution(_ n:Int) -> Int {
    var f = [0, 1]

    for i in 2...n {
        f.append((f[i-2] + f[i-1]) % 1234567)
    }
  
    return f[n]
}