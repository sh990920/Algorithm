func solution(_ arr:[Int]) -> [Int] {
    var result = arr
    
    if arr.count == 1 {
        result.removeAll()
        result.append(-1)
        return result
    }
    
    var num = result[0]
    
    for i in result {
        if num > i {
            num = i
        }
    }
    
    if let value = result.firstIndex(of: num) {
        result.remove(at: value)
    }
    
    return result
}