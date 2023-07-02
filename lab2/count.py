import json

# 读取txt文件内容
with open('./result.txt', 'r') as file:
    content = file.read()

# 将每行内容解析为JSON对象，并统计"host"字段的出现次数
host_count = {}
lines = content.strip().split('\n')
for line in lines:
    data = json.loads(line)
    host = data.get('host', '')
    host_count[host] = host_count.get(host, 0) + 1

# 输出每种情况出现的次数
for host, count in host_count.items():
    print(f'Host: {host}\tCount: {count}')
