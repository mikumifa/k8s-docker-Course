$intervalInSeconds = 1
$outputFile = "result.txt"

while ($true) {
    $url = "http://localhost:30956/user?id=2"

    $response = Invoke-WebRequest -Uri $url
    $responseContent = $response.Content

    Add-Content -Path $outputFile -Value $responseContent

    Write-Host "�����ѷ��Ͳ������׷�ӵ� $outputFile �ļ��С�"

    Start-Sleep -Seconds $intervalInSeconds
}
