cd src/main/osv && for f in `find | egrep -v Eliminate`; do echo "$f" ' -- ' `file -bi "$f"` ; done
