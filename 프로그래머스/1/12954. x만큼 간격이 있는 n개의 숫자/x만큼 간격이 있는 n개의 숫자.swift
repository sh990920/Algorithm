func solution(_ x:Int, _ n:Int) -> [Int64] {
    var arr = Array<Int64>()
    for i in 1...n{
        arr.append(Int64(x) * Int64(i))
    }
    return arr
}