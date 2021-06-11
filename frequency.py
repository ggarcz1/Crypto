# python frequency counter for crypto analysis 

table = {}
message = input('Enter message to count frequency of values: ')
for idx in message:
    if table.get(idx) is None:
        table[idx] = 1
    else:
        table[idx] = table[idx] + 1

print('Value'+'\t'+'Count')
for idx in table:
    print(idx+'\t'+str(table[idx]))