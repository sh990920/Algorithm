import Foundation

func solution(_ n: Int, _ k: Int) -> Int {
    let s = String(n, radix: k)
    return s.split(separator: "0").filter { p in !p.isEmpty && p != "1" && isPrime(Int(p)!) && (s.contains("0\(p)0") || s.contains("\(p)0") || s.contains("0\(p)") || s.contains(p)) }.count
}

private func isPrime(_ n: Int) -> Bool {
    var i = 2

    while i <= Int(sqrt(Double(n))) {
        guard n % i != 0 else {
            return false
        }
        i += 1
    }
    return true
}