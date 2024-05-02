import Foundation

let person = Int(readLine()!)!

var cnt = 0

for i in 1 ... person {
    if i * i <= person {
        cnt += 1
    }
    if i * i > person {
        break
    }
}
print(cnt)