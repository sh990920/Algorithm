func solution(_ s:String) -> Bool {
    var result: Bool = false
    
    if s.count == 4 || s.count == 6 {
        if let a = Int(s) {
            result = true
        }
    }
    
    return result
}