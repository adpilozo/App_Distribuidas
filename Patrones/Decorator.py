class Text:
    def render(self):
        return "Hello, World!"

class BoldDecorator:
    def __init__(self, wrapped):
        self.wrapped = wrapped

    def render(self):
        return f"<b>{self.wrapped.render()}</b>"

class ItalicDecorator:
    def __init__(self, wrapped):
        self.wrapped = wrapped

    def render(self):
        return f"<i>{self.wrapped.render()}</i>"

# Uso
text = Text()
bold_text = BoldDecorator(text)
italic_bold_text = ItalicDecorator(bold_text)

print(italic_bold_text.render())  # <i><b>Hello, World!</b></i>
