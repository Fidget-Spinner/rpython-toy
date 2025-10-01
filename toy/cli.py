import argparse
import toy.main

parser = argparse.ArgumentParser(prog='toy-cli')
parser.add_argument('filename', type=str)

def cli(filename: str):
    with open(filename) as fp:
        toy.main.main(fp.read())

args = parser.parse_args()
cli(args.filename)