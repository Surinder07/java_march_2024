## Recap 

1. Unix ? 
Kernel, Shell

touch, mkdir, ls 

ls 
ls -l


/  

~

// grep , sort 

## Grep 
## Sort


## Permissions



OWNER      GROUP       PUBLIC
create a file -- change permission 
1. owner can read write and execute but group and public should only have read only 
2. read only for group and rest can rwx
3. owner can read/write but remaing group can only write. 




==Shell script == 
1. created a file .sh extension 

myfile.sh

2. execute the file ------- >  ./myfile.sh
3. changed the permission to exectue
chmod +x myfile.sh  ----> execution 


added 
echo "Hello World"!

example 
1. create a file and print your name after running the file.




## 

#!/bin/bash

echo "Enter a number"
read number

if [ $number -gt 0 ]; then
echo "$number is positive"
elif [$number -lt 0]; then
echo "$number is positive"
else
echo "$number is zero"
fi

else if ---> elif 











