func solution(_ arr:[Int]) -> Double {
    var res : Double = 0
    for i in arr {
        res += Double(i)
    }
    res /= Double(arr.count)
    return res
}