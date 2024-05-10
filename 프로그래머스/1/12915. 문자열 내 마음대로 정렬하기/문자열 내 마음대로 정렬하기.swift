func solution(_ strings:[String], _ n:Int) -> [String] {
    var strs = strings
    strs.sort()
    let sortedStrings = strs.sorted {
        $0[$0.index($0.startIndex, offsetBy: n)] < $1[$1.index($1.startIndex, offsetBy: n)]
    }
    return sortedStrings
}