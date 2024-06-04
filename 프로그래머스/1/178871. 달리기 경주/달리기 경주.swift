import Foundation

func solution(_ players:[String], _ callings:[String]) -> [String] {
    var ranking = Array<String>()
    var nameKey = Dictionary<String, Int>()
    var idxKey = Dictionary<Int, String>()
    for (idx, name) in players.enumerated() {
        nameKey[name] = idx
        idxKey[idx] = name
    }
    for call in callings {
        var idx = nameKey[call]!
        var previousIdx = idx - 1
        var previousName = idxKey[previousIdx]!
        idxKey[previousIdx] = call
        idxKey[idx] = previousName
        nameKey[call] = previousIdx
        nameKey[previousName] = idx
    }
    let count = players.count
    for i in 0..<count {
        var name = idxKey[i]!
        ranking.append(name)
    }
    return ranking
}