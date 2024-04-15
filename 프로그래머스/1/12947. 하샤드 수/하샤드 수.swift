func solution(_ x:Int) -> Bool {
    var result = true
    
    var x_str = String(x)
    
    var sum = 0
    
    for i in x_str {
        if let num = Int(String(i)){
            sum += num
        }
    }
    
    if (x % sum != 0) {
        result = false
    }
    
    return result
}