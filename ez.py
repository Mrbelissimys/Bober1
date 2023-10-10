import os
from github import Github
import threading
import telebot
from time import sleep

bot = telebot.TeleBot("5474964331:AAELX10LUwcXPcZP5zJxy4PW6Wy0r5vl7XM")
g = Github(os.getenv("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"))

def GetCurrentFileCount():
    repo = g.get_repo("Mrbelissimys/Bober1")
    contents = repo.get_contents("")
    FileCount = len(contents)
    return(FileCount)

def check_repository_changes(count):
   repo = g.get_repo("Mrbelissimys/Bober1")
   contents = repo.get_contents("")
   CurrentCount = len(contents)
   if CurrentCount != count:
       return True
   else:
       return False

def main():
    count = GetCurrentFileCount()
    while True:
        if check_repository_changes(count):
            bot.send_message(-550016475, '+')
            print("UPDATE")
            count = GetCurrentFileCount()
            check_repository_changes(count)
        else:
            print("nothing")
            sleep(300)
            check_repository_changes(count)
main()








#
#
#
#
#
#
#
#
#bot.infinity_polling()