class EventStore:
    def __init__(self):
        self.events = []

    def add_event(self, event):
        self.events.append(event)

    def get_events(self):
        return self.events

# Uso
store = EventStore()
store.add_event({"type": "order_created", "order_id": 1})
store.add_event({"type": "order_shipped", "order_id": 1})

for event in store.get_events():
    print(event)
