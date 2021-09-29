all: build


build:
	mkdir build
	javac -d build `find src -name "*.java"`
	jar -cvfe build/SortingAlgorithms.jar Driver -C build .

clean:
	rm -r build

