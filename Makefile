build: 
	make mdbook
	make web
	make pdf
mdbook: 
	zip KotlinB-mdbook.zip book.toml src/ book/ -r

web:
	zip KotlinB-web.zip book/ -r 
pdf: 
	zip KotlinB-pdf.zip Tex/ -r 
