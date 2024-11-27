class Singleton:
    _instance = None

    def __new__(cls, *args, **kwargs):
        if not cls._instance:
            cls._instance = super().__new__(cls)
        return cls._instance

# Uso
singleton1 = Singleton()
singleton2 = Singleton()
print(singleton1 is singleton2)  # True
