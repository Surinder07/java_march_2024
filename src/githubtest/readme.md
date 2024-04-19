added some git features...


1. git stash 
2. git reset 
3. .gitignore 
4. rebase 


stash 

working on FILE A -------------WIP , not close, not commit 

git stash ---------> moving current/ WIP into stash 



FILE B ---> finish -> commit ---> push

# stash 
git stash 
git stash apply 
git stash pop 


add to staging area -----> commit [commit id ]  ------->  push [remote ]


## git reset 

git reset file_name

                        add .               commit          push
working directory ----- staging area --------commit --------remote 
