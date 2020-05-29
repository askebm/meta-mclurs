COMPONENTS=libmclurs-snap-perl-1.0 mclurs-1.0

build:
	for A in ${COMPONENTS}; do make -C $$A build; done

install:
	for A in ${COMPONENTS}; do make -C $$A install; done

clean:
	for A in ${COMPONENTS}; do make -C $$A clean; done

