# Існує популярний веб-сервер задача якого прибирати зайві символи "/".
# Наприклад, рядок "/page1///page2////page3/test.html" має стиснутись до "/page1/page2/page3/test.html"
# На жаль, оригінальний алгоритм має квадратичну складність, 
# чим можуть скористатись хакери відправивши одночасно ряд запитів з великою кількістью символів "/".
# Вас запросили як спеціаліста з алгоритмів для усунення потенційної небезпеки. Пришвидшіть оригінальний алгоритм, аби він працював за лінію.
# python3
```python
def noTwoSlash(url: str):
    _list = list(url)
    i = 1
    while i < len(_list):
        if (_list[i-1] == '/') and (_list[i] == '/'):
            for y in range(i+1, len(_list)):
                _list[y-1] = _list[y]
            _list = _list[:-1]
        else:
            i += 1
    return ''.join(_list)
```